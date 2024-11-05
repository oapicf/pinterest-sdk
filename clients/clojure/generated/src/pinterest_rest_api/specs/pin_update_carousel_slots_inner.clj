(ns pinterest-rest-api.specs.pin-update-carousel-slots-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-update-carousel-slots-inner-data
  {
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :link) string?
   })

(def pin-update-carousel-slots-inner-spec
  (ds/spec
    {:name ::pin-update-carousel-slots-inner
     :spec pin-update-carousel-slots-inner-data}))
