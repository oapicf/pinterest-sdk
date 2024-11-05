(ns pinterest-rest-api.specs.interest
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def interest-data
  {
   (ds/opt :canonical_url) string?
   (ds/opt :id) string?
   (ds/opt :key) string?
   (ds/opt :name) string?
   })

(def interest-spec
  (ds/spec
    {:name ::interest
     :spec interest-data}))
