(ns pinterest-rest-api.specs.follow-user-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def follow-user-request-data
  {
   (ds/opt :auto_follow) boolean?
   })

(def follow-user-request-spec
  (ds/spec
    {:name ::follow-user-request
     :spec follow-user-request-data}))
