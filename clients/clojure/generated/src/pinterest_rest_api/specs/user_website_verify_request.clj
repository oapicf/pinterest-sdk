(ns pinterest-rest-api.specs.user-website-verify-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-website-verify-request-data
  {
   (ds/opt :verification_method) string?
   (ds/opt :website) string?
   })

(def user-website-verify-request-spec
  (ds/spec
    {:name ::user-website-verify-request
     :spec user-website-verify-request-data}))
