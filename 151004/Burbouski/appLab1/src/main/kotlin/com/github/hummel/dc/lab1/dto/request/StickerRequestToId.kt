package com.github.hummel.dc.lab1.dto.request

import com.github.hummel.dc.lab1.bean.Sticker
import kotlinx.serialization.Serializable

@Serializable
data class StickerRequestToId(
	private val id: Long, private val name: String
) {
	fun toBean(): Sticker = Sticker(
		id, name
	)

	init {
		require(name.length in 2..32)
	}
}