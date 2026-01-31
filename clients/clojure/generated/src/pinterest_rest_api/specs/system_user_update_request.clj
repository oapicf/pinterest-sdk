(ns pinterest-rest-api.specs.system-user-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def system-user-update-request-data
  {
   (ds/req :name) string?
   })

(def system-user-update-request-spec
  (ds/spec
    {:name ::system-user-update-request
     :spec system-user-update-request-data}))
