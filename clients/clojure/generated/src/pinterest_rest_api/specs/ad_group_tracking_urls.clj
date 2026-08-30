(ns pinterest-rest-api.specs.ad-group-tracking-urls
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-group-tracking-urls-data
  {
   (ds/opt :audience_verification) (s/coll-of string?)
   (ds/opt :buyable_button) (s/coll-of string?)
   (ds/opt :click) (s/coll-of string?)
   (ds/opt :engagement) (s/coll-of string?)
   (ds/opt :impression) (s/coll-of string?)
   })

(def ad-group-tracking-urls-spec
  (ds/spec
    {:name ::ad-group-tracking-urls
     :spec ad-group-tracking-urls-data}))
