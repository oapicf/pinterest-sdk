(ns pinterest-rest-api.specs.notification-post-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def notification-post-request-data
  {
   })

(def notification-post-request-spec
  (ds/spec
    {:name ::notification-post-request
     :spec notification-post-request-data}))
