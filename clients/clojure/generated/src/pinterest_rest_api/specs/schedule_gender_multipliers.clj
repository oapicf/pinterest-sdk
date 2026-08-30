(ns pinterest-rest-api.specs.schedule-gender-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-gender :refer :all]
            )
  (:import (java.io File)))


(def schedule-gender-multipliers-data
  {
   (ds/opt :GENDER) targeting-spec-gender-spec
   })

(def schedule-gender-multipliers-spec
  (ds/spec
    {:name ::schedule-gender-multipliers
     :spec schedule-gender-multipliers-data}))
