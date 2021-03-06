package com.tencent.devops.api

import com.fasterxml.jackson.core.type.TypeReference
import com.tencent.bk.devops.atom.api.BaseApi
import com.tencent.bk.devops.atom.pojo.Result
import com.tencent.bk.devops.atom.utils.json.JsonUtil
import com.tencent.devops.pojo.process.PipelineBuildTaskInfo

class PipelineTaskResourceApi : BaseApi() {

    fun getAllBuildTask(): Result<List<PipelineBuildTaskInfo>> {
        val path = "/ms/process/api/build/task/getAllBuildTask"
        val request = buildGet(path)
        val responseContent = request(request, "领取构建机任务详情失败")
        return JsonUtil.fromJson(responseContent, object : TypeReference<Result<List<PipelineBuildTaskInfo>>>() {})
    }
}
