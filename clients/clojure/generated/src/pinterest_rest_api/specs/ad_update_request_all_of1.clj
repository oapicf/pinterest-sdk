(ns pinterest-rest-api.specs.ad-update-request-all-of1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-update-request-all-of1-data
  {
   (ds/req :id) string?
   (ds/opt :pin_id) string?
   })

(def ad-update-request-all-of1-spec
  (ds/spec
    {:name ::ad-update-request-all-of1
     :spec ad-update-request-all-of1-data}))
