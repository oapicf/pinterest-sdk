(ns pinterest-rest-api.specs.schedule-delta-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bid-options-age-bucket-multipliers :refer :all]
            [pinterest-rest-api.specs.bid-options-app-type-multipliers :refer :all]
            [pinterest-rest-api.specs.bid-options-audience-multipliers :refer :all]
            [pinterest-rest-api.specs.bid-options-gender-multipliers :refer :all]
            [pinterest-rest-api.specs.bid-options-placement-multipliers :refer :all]
            )
  (:import (java.io File)))


(def schedule-delta-value-data
  {
   (ds/opt :age_bucket_multipliers) bid-options-age-bucket-multipliers-spec
   (ds/opt :app_type_multipliers) bid-options-app-type-multipliers-spec
   (ds/opt :audience_multipliers) (s/coll-of bid-options-audience-multipliers-spec)
   (ds/opt :gender_multipliers) bid-options-gender-multipliers-spec
   (ds/opt :placement_multipliers) bid-options-placement-multipliers-spec
   })

(def schedule-delta-value-spec
  (ds/spec
    {:name ::schedule-delta-value
     :spec schedule-delta-value-data}))
