(ns pinterest-rest-api.specs.schedule-bid-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.schedule-age-bucket-multipliers :refer :all]
            [pinterest-rest-api.specs.schedule-app-type-multipliers :refer :all]
            [pinterest-rest-api.specs.schedule-audience-multipliers :refer :all]
            [pinterest-rest-api.specs.schedule-bid-options-gender-multipliers :refer :all]
            [pinterest-rest-api.specs.schedule-bid-options-placement-multipliers :refer :all]
            )
  (:import (java.io File)))


(def schedule-bid-options-data
  {
   (ds/opt :age_bucket_multipliers) schedule-age-bucket-multipliers-spec
   (ds/opt :app_type_multipliers) schedule-app-type-multipliers-spec
   (ds/opt :audience_multipliers) schedule-audience-multipliers-spec
   (ds/opt :gender_multipliers) schedule-bid-options-gender-multipliers-spec
   (ds/opt :placement_multipliers) schedule-bid-options-placement-multipliers-spec
   })

(def schedule-bid-options-spec
  (ds/spec
    {:name ::schedule-bid-options
     :spec schedule-bid-options-data}))
