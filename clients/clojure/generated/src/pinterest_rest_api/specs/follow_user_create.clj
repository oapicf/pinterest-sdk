(ns pinterest-rest-api.specs.follow-user-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def follow-user-create-data
  {
   (ds/opt :auto_follow) boolean?
   })

(def follow-user-create-spec
  (ds/spec
    {:name ::follow-user-create
     :spec follow-user-create-data}))
