(ns pinterest-rest-api.specs.follow-user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def follow-user-data
  {
   (ds/opt :type) string?
   (ds/opt :username) string?
   })

(def follow-user-spec
  (ds/spec
    {:name ::follow-user
     :spec follow-user-data}))
