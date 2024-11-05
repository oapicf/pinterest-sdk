(ns pinterest-rest-api.specs.targeting-template-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-template-update-request-data
  {
   (ds/req :operation_type) string?
   (ds/req :id) string?
   })

(def targeting-template-update-request-spec
  (ds/spec
    {:name ::targeting-template-update-request
     :spec targeting-template-update-request-data}))
