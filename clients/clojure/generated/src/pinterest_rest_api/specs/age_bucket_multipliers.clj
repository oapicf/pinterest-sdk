(ns pinterest-rest-api.specs.age-bucket-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-age-bucket :refer :all]
            )
  (:import (java.io File)))


(def age-bucket-multipliers-data
  {
   (ds/opt :AGE_BUCKET) targeting-spec-age-bucket-spec
   })

(def age-bucket-multipliers-spec
  (ds/spec
    {:name ::age-bucket-multipliers
     :spec age-bucket-multipliers-data}))
