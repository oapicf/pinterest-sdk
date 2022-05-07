(ns pinterest-rest-api.specs.tracking-urls
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tracking-urls-data
  {
   (ds/opt :impression) (s/coll-of string?)
   (ds/opt :click) (s/coll-of string?)
   (ds/opt :engagement) (s/coll-of string?)
   (ds/opt :buyable_button) (s/coll-of string?)
   (ds/opt :audience_verification) (s/coll-of string?)
   })

(def tracking-urls-spec
  (ds/spec
    {:name ::tracking-urls
     :spec tracking-urls-data}))
