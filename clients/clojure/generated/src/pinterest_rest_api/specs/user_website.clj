(ns pinterest-rest-api.specs.user-website
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-website-data
  {
   (ds/opt :status) string?
   (ds/opt :verified_at) string?
   (ds/opt :website) string?
   })

(def user-website-spec
  (ds/spec
    {:name ::user-website
     :spec user-website-data}))
