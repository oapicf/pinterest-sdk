(ns pinterest-rest-api.specs.campaign-bid-options-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.age-bucket-multipliers :refer :all]
            [pinterest-rest-api.specs.app-type-multipliers :refer :all]
            [pinterest-rest-api.specs.campaign-audience-multipliers :refer :all]
            [pinterest-rest-api.specs.freq-bid-multiplier-time-window :refer :all]
            [pinterest-rest-api.specs.frequency-multipliers :refer :all]
            [pinterest-rest-api.specs.gender-multipliers :refer :all]
            [pinterest-rest-api.specs.placement-multipliers :refer :all]
            )
  (:import (java.io File)))


(def campaign-bid-options-create-data
  {
   (ds/opt :age_bucket_multipliers) age-bucket-multipliers-spec
   (ds/opt :app_type_multipliers) app-type-multipliers-spec
   (ds/opt :audience_multipliers) campaign-audience-multipliers-spec
   (ds/opt :freq_bid_multiplier_time_window) freq-bid-multiplier-time-window-spec
   (ds/opt :frequency_multipliers) frequency-multipliers-spec
   (ds/opt :gender_multipliers) gender-multipliers-spec
   (ds/opt :placement_multipliers) placement-multipliers-spec
   })

(def campaign-bid-options-create-spec
  (ds/spec
    {:name ::campaign-bid-options-create
     :spec campaign-bid-options-create-data}))
