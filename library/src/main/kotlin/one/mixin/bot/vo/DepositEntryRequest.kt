package one.mixin.bot.vo

import com.google.gson.annotations.SerializedName

data class DepositEntryRequest(
    @SerializedName("chain_id")
    val chainId: String,
    @SerializedName("members")
    val members: List<String>?,
)
