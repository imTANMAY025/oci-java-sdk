/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.applicationmigration.responses;

import com.oracle.bmc.applicationmigration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class DeleteMigrationResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DeleteMigrationResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());

            return this;
        }
    }
}
