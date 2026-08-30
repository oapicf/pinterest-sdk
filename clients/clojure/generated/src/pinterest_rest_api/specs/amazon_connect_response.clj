(ns pinterest-rest-api.specs.amazon-connect-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def amazon-connect-response-data
  {
   (ds/opt :message) string?
   })

(def amazon-connect-response-spec
  (ds/spec
    {:name ::amazon-connect-response
     :spec amazon-connect-response-data}))
