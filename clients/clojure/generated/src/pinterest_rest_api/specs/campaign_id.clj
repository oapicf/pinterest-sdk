(ns pinterest-rest-api.specs.campaign-id
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-id-data
  {
   (ds/opt :id) string?
   })

(def campaign-id-spec
  (ds/spec
    {:name ::campaign-id
     :spec campaign-id-data}))
