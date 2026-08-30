//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_filter_status.g.dart';

class InviteFilterStatus extends EnumClass {

  /// Invite statuses used for filters.
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const InviteFilterStatus PENDING = _$PENDING;
  /// Invite statuses used for filters.
  @BuiltValueEnumConst(wireName: r'EXPIRED')
  static const InviteFilterStatus EXPIRED = _$EXPIRED;

  static Serializer<InviteFilterStatus> get serializer => _$inviteFilterStatusSerializer;

  const InviteFilterStatus._(String name): super(name);

  static BuiltSet<InviteFilterStatus> get values => _$values;
  static InviteFilterStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class InviteFilterStatusMixin = Object with _$InviteFilterStatusMixin;

