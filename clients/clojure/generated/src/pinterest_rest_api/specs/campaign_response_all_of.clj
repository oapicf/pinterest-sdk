(ns pinterest-rest-api.specs.campaign-response-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-response-all-of-data
  {
   (ds/req :id) string?
   })

(def campaign-response-all-of-spec
  (ds/spec
    {:name ::campaign-response-all-of
     :spec campaign-response-all-of-data}))
