(ns pinterest-rest-api.specs.campaign-bid-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.app-type-multipliers :refer :all]
            [pinterest-rest-api.specs.campaign-audience-multipliers :refer :all]
            [pinterest-rest-api.specs.placement-multipliers :refer :all]
            )
  (:import (java.io File)))


(def campaign-bid-options-data
  {
   (ds/opt :app_type_multipliers) app-type-multipliers-spec
   (ds/opt :audience_multipliers) campaign-audience-multipliers-spec
   (ds/opt :placement_multipliers) placement-multipliers-spec
   })

(def campaign-bid-options-spec
  (ds/spec
    {:name ::campaign-bid-options
     :spec campaign-bid-options-data}))
