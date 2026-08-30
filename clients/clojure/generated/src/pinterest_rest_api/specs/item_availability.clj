(ns pinterest-rest-api.specs.item-availability
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-availability-data
  {
   })

(def item-availability-spec
  (ds/spec
    {:name ::item-availability
     :spec item-availability-data}))
