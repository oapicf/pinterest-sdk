(ns pinterest-rest-api.specs.system-user-update-with-required-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def system-user-update-with-required-body-data
  {
   (ds/req :name) string?
   })

(def system-user-update-with-required-body-spec
  (ds/spec
    {:name ::system-user-update-with-required-body
     :spec system-user-update-with-required-body-data}))
