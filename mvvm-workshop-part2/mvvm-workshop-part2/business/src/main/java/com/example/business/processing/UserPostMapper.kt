package com.example.business.processing

import com.example.business.model.UserPost
import com.example.data.RawData

class UserPostMapper {
    companion object {
        fun getUserPostMapper(): UserPost {
            val userPostRaw = RawData.getUserPostFromRepository()
            val list = userPostRaw.split("|")
            val id = list[0]
            val name = list[1]

            return UserPost(id)
        }


    }
}