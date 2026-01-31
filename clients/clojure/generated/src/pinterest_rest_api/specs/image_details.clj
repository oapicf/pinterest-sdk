(ns pinterest-rest-api.specs.image-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def image-details-data
  {
   (ds/req :height) int?
   (ds/req :url) string?
   (ds/req :width) int?
   })

(def image-details-spec
  (ds/spec
    {:name ::image-details
     :spec image-details-data}))
