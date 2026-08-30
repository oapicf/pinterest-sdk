(ns pinterest-rest-api.specs.schedule-bid-options-gender-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-gender :refer :all]
            )
  (:import (java.io File)))


(def schedule-bid-options-gender-multipliers-data
  {
   (ds/opt :GENDER) targeting-spec-gender-spec
   })

(def schedule-bid-options-gender-multipliers-spec
  (ds/spec
    {:name ::schedule-bid-options-gender-multipliers
     :spec schedule-bid-options-gender-multipliers-data}))
