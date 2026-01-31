(ns pinterest-rest-api.specs.user-website-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-website-summary-data
  {
   (ds/opt :status) string?
   (ds/opt :verified_at) string?
   (ds/opt :website) string?
   })

(def user-website-summary-spec
  (ds/spec
    {:name ::user-website-summary
     :spec user-website-summary-data}))
