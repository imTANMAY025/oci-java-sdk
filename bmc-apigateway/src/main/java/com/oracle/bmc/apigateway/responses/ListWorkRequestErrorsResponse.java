/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway.responses;

import com.oracle.bmc.apigateway.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListWorkRequestErrorsResponse {

    /**
     * For list pagination. When this header appears in the response,
     * additional pages of results remain. For important details about how
     * pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response,
     * additional pages of results were seen previously. For important details
     * about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * id.
     *
     */
    private String opcRequestId;

    /**
     * The returned WorkRequestErrorCollection instance.
     */
    private WorkRequestErrorCollection workRequestErrorCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListWorkRequestErrorsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            opcRequestId(o.getOpcRequestId());
            workRequestErrorCollection(o.getWorkRequestErrorCollection());

            return this;
        }
    }
}
