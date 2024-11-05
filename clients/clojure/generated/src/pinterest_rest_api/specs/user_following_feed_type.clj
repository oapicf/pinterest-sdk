(ns pinterest-rest-api.specs.user-following-feed-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-following-feed-type-data
  {
   })

(def user-following-feed-type-spec
  (ds/spec
    {:name ::user-following-feed-type
     :spec user-following-feed-type-data}))
