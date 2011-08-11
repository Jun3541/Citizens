package net.citizensnpcs.questers.rewards;

import net.citizensnpcs.questers.Reward;
import net.citizensnpcs.questers.quests.QuestManager;
import net.citizensnpcs.questers.quests.QuestManager.RewardType;
import net.citizensnpcs.resources.npclib.HumanNPC;

import org.bukkit.entity.Player;

public class QuestReward implements Reward {
	private final String reward;

	public QuestReward(String quest) {
		this.reward = quest;
	}

	public void grantQuest(Player player, HumanNPC npc) {
		QuestManager.assignQuest(npc, player, reward);
	}

	@Override
	public void grant(Player player) {
	}

	@Override
	public RewardType getType() {
		return RewardType.QUEST;
	}

	@Override
	public Object getReward() {
		return reward;
	}

	@Override
	public boolean isTake() {
		return false;
	}

	@Override
	public boolean canTake(Player player) {
		return true;
	}

	@Override
	public String getRequiredText(Player player) {
		return "";
	}
}