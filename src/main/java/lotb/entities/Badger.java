package lotb.entities;

import lotb.registries.ModEntities;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.EatGrassGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Badger extends AnimalEntity {
	private int timer;
	private EatGrassGoal eats_grass_goal;

	public Badger(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		Badger child = new Badger(ModEntities.BADGER,this.world);
		child.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(child)), SpawnReason.BREEDING, null, null);
		return child;
	}
	protected void registerGoals() {
		super.registerGoals();
		eats_grass_goal=new EatGrassGoal(this);
		goalSelector.addGoal(0, new SwimGoal(this));
		goalSelector.addGoal(1, new PanicGoal(this,1.25d));
		goalSelector.addGoal(3, new BreedGoal(this,1.0d));
		goalSelector.addGoal(5, eats_grass_goal);
	}
	protected void updateAITasks() {
		timer = eats_grass_goal.getEatingGrassTimer();
		super.updateAITasks();
	}
	public void livingTick() {
		if (this.world.isRemote)
			this.timer = Math.max(0,timer -1);
		super.livingTick();
	}
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0d);
	}

}
