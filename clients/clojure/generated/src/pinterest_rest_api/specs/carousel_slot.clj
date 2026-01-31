(ns pinterest-rest-api.specs.carousel-slot
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def carousel-slot-data
  {
   (ds/opt :description) string?
   (ds/opt :link) string?
   (ds/opt :title) string?
   })

(def carousel-slot-spec
  (ds/spec
    {:name ::carousel-slot
     :spec carousel-slot-data}))
