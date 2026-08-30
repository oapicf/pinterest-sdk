(ns pinterest-rest-api.specs.targeting-spec-optimal
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-age-bucket :refer :all]
            [pinterest-rest-api.specs.targeting-spec-app-type :refer :all]
            [pinterest-rest-api.specs.targeting-spec-gender :refer :all]
            [pinterest-rest-api.specs.targeting-spec-shopping-retargeting :refer :all]
            [pinterest-rest-api.specs.targeting-strategy :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-optimal-data
  {
   (ds/opt :AGE_BUCKET) (s/coll-of targeting-spec-age-bucket-spec)
   (ds/opt :APPTYPE) (s/coll-of targeting-spec-app-type-spec)
   (ds/opt :AUDIENCE_EXCLUDE) (s/coll-of string?)
   (ds/opt :AUDIENCE_INCLUDE) (s/coll-of string?)
   (ds/opt :GENDER) (s/coll-of targeting-spec-gender-spec)
   (ds/opt :GEO) (s/coll-of string?)
   (ds/opt :GEO_EXCLUDE) (s/coll-of string?)
   (ds/opt :INTEREST) (s/coll-of string?)
   (ds/opt :LOCALE) (s/coll-of string?)
   (ds/opt :LOCATION) (s/coll-of string?)
   (ds/opt :LOCATION_EXCLUDE) (s/coll-of string?)
   (ds/opt :MAXIMUM_AGE) string?
   (ds/opt :MINIMUM_AGE) string?
   (ds/opt :SHOPPING_RETARGETING) (s/coll-of targeting-spec-shopping-retargeting-spec)
   (ds/opt :TARGETING_STRATEGY) (s/coll-of targeting-strategy-spec)
   })

(def targeting-spec-optimal-spec
  (ds/spec
    {:name ::targeting-spec-optimal
     :spec targeting-spec-optimal-data}))
