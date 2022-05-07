(ns pinterest-rest-api.specs.ad-account-owner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-owner-data
  {
   (ds/opt :username) string?
   })

(def ad-account-owner-spec
  (ds/spec
    {:name ::ad-account-owner
     :spec ad-account-owner-data}))
