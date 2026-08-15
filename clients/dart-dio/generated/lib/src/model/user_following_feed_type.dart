//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_following_feed_type.g.dart';

class UserFollowingFeedType extends EnumClass {

  /// Specifies the type of followees to be kept when filtering them.
  @BuiltValueEnumConst(wireName: r'ALL')
  static const UserFollowingFeedType ALL = _$ALL;
  /// Specifies the type of followees to be kept when filtering them.
  @BuiltValueEnumConst(wireName: r'RANKED')
  static const UserFollowingFeedType RANKED = _$RANKED;
  /// Specifies the type of followees to be kept when filtering them.
  @BuiltValueEnumConst(wireName: r'CREATOR_ONLY')
  static const UserFollowingFeedType CREATOR_ONLY = _$CREATOR_ONLY;
  /// Specifies the type of followees to be kept when filtering them.
  @BuiltValueEnumConst(wireName: r'RANKED_CREATOR_ONLY')
  static const UserFollowingFeedType RANKED_CREATOR_ONLY = _$RANKED_CREATOR_ONLY;

  static Serializer<UserFollowingFeedType> get serializer => _$userFollowingFeedTypeSerializer;

  const UserFollowingFeedType._(String name): super(name);

  static BuiltSet<UserFollowingFeedType> get values => _$values;
  static UserFollowingFeedType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class UserFollowingFeedTypeMixin = Object with _$UserFollowingFeedTypeMixin;

