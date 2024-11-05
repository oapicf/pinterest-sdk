(ns pinterest-rest-api.specs.linked-business
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def linked-business-data
  {
   (ds/opt :username) string?
   (ds/opt :image_small_url) string?
   (ds/opt :image_medium_url) string?
   (ds/opt :image_large_url) string?
   (ds/opt :image_xlarge_url) string?
   })

(def linked-business-spec
  (ds/spec
    {:name ::linked-business
     :spec linked-business-data}))
