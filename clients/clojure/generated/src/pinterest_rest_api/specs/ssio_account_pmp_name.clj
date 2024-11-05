(ns pinterest-rest-api.specs.ssio-account-pmp-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-account-pmp-name-data
  {
   (ds/opt :name) string?
   (ds/opt :id) string?
   })

(def ssio-account-pmp-name-spec
  (ds/spec
    {:name ::ssio-account-pmp-name
     :spec ssio-account-pmp-name-data}))
