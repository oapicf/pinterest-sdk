(ns pinterest-rest-api.specs.business-access-user-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-access-user-summary-data
  {
   (ds/opt :email) string?
   (ds/opt :id) string?
   (ds/opt :username) string?
   })

(def business-access-user-summary-spec
  (ds/spec
    {:name ::business-access-user-summary
     :spec business-access-user-summary-data}))
