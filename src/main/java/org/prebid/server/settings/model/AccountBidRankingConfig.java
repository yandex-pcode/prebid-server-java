package org.prebid.server.settings.model;

import lombok.Value;

@Value(staticConstructor = "of")
public class AccountBidRankingConfig {

    Boolean enabled;
}
