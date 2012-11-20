package com.zynx.spike.conversion

import com.google.gson.Gson

class JsonConverter {
    static <T> T fromJson(Reader reader, Class<T> targetClass) {
        return new Gson().fromJson(reader, targetClass)
    }
}
