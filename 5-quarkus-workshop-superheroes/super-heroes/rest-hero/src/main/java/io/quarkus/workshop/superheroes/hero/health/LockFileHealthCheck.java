package io.quarkus.workshop.superheroes.hero.health;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@ApplicationScoped
public class LockFileHealthCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {

		HealthCheckResponseBuilder builder = HealthCheckResponse.named("LockFile check");

		if (new Random().nextBoolean()) {
			builder.down().withData("lock-file", "lock file exist");
		} else {
			builder.up();
		}

		return builder.build();
	}

}
