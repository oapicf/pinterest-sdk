(ns pinterest-rest-api.specs.audience-demographics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-demographic-value :refer :all]
            [pinterest-rest-api.specs.audience-demographic-value :refer :all]
            [pinterest-rest-api.specs.audience-demographic-value :refer :all]
            [pinterest-rest-api.specs.audience-demographic-value :refer :all]
            [pinterest-rest-api.specs.audience-demographic-value :refer :all]
            )
  (:import (java.io File)))


(def audience-demographics-data
  {
   (ds/opt :ages) (s/coll-of audience-demographic-value-spec)
   (ds/opt :genders) (s/coll-of audience-demographic-value-spec)
   (ds/opt :devices) (s/coll-of audience-demographic-value-spec)
   (ds/opt :metros) (s/coll-of audience-demographic-value-spec)
   (ds/opt :countries) (s/coll-of audience-demographic-value-spec)
   })

(def audience-demographics-spec
  (ds/spec
    {:name ::audience-demographics
     :spec audience-demographics-data}))
