package org.handler.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record HealthCheckResponse(UUID id, String status) {}
