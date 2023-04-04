package com.myorg

import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
//import software.amazon.awscdk.Duration
//import software.amazon.awscdk.services.sqs.Queue
import software.constructs.Construct

class EcsHttpsStack @JvmOverloads constructor(scope: Construct?, id: String?, props: StackProps? = null) : Stack(scope, id, props) {
    init {

        // The code that defines your stack goes here

        // example resource
//        val queue = Queue.Builder.create(this, "EcsHttpsQueue")
//                .visibilityTimeout(Duration.seconds(300))
//                .build()
    }
}