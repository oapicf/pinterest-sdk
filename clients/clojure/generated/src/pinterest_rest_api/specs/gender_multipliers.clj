(ns pinterest-rest-api.specs.gender-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-gender :refer :all]
            )
  (:import (java.io File)))


(def gender-multipliers-data
  {
   (ds/opt :GENDER) targeting-spec-gender-spec
   })

(def gender-multipliers-spec
  (ds/spec
    {:name ::gender-multipliers
     :spec gender-multipliers-data}))
