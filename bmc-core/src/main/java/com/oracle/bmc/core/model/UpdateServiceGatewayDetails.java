/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateServiceGatewayDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateServiceGatewayDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
        private Boolean blockTraffic;

        public Builder blockTraffic(Boolean blockTraffic) {
            this.blockTraffic = blockTraffic;
            this.__explicitlySet__.add("blockTraffic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<ServiceIdRequestDetails> services;

        public Builder services(java.util.List<ServiceIdRequestDetails> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateServiceGatewayDetails build() {
            UpdateServiceGatewayDetails __instance__ =
                    new UpdateServiceGatewayDetails(
                            blockTraffic, definedTags, displayName, freeformTags, services);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateServiceGatewayDetails o) {
            Builder copiedBuilder =
                    blockTraffic(o.getBlockTraffic())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .services(o.getServices());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the service gateway blocks all traffic through it. The default is `false`. When
     * this is `true`, traffic is not routed to any services, regardless of route rules.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
    Boolean blockTraffic;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"foo-value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * List of all the services you want enabled on this service gateway. Sending an empty list
     * means you want to disable all services. Omitting this parameter entirely keeps the
     * existing list of services intact.
     * <p>
     * You can also enable or disable a particular service by using
     * {@link #attachServiceId(AttachServiceIdRequest) attachServiceId} and
     * {@link #detachServiceId(DetachServiceIdRequest) detachServiceId}.
     * <p>
     * For each enabled service, make sure there's a route rule with the service's `cidrBlock`
     * as the rule's destination CIDR and the service gateway as the rule's target. See
     * {@link RouteTable}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    java.util.List<ServiceIdRequestDetails> services;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
