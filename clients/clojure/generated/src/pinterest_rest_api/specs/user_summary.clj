(ns pinterest-rest-api.specs.user-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-summary-data
  {
   (ds/opt :username) string?
   (ds/opt :type) string?
   })

(def user-summary-spec
  (ds/spec
    {:name ::user-summary
     :spec user-summary-data}))
