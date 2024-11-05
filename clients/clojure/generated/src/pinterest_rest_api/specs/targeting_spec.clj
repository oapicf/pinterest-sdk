(ns pinterest-rest-api.specs.targeting-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-shopping-retargeting :refer :all]
            )
  (:import (java.io File)))


(def targeting-spec-data
  {
   (ds/opt :AGE_BUCKET) (s/coll-of string?)
   (ds/opt :APPTYPE) (s/coll-of string?)
   (ds/opt :AUDIENCE_EXCLUDE) (s/coll-of string?)
   (ds/opt :AUDIENCE_INCLUDE) (s/coll-of string?)
   (ds/opt :GENDER) (s/coll-of string?)
   (ds/opt :GEO) (s/coll-of string?)
   (ds/opt :INTEREST) (s/coll-of string?)
   (ds/opt :LOCALE) (s/coll-of string?)
   (ds/opt :LOCATION) (s/coll-of string?)
   (ds/opt :SHOPPING_RETARGETING) (s/coll-of targeting-spec-shopping-retargeting-spec)
   (ds/opt :TARGETING_STRATEGY) (s/coll-of string?)
   })

(def targeting-spec-spec
  (ds/spec
    {:name ::targeting-spec
     :spec targeting-spec-data}))
