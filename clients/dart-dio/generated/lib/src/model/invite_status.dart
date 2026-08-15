//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_status.g.dart';

class InviteStatus extends EnumClass {

  /// The current status of the invite.
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const InviteStatus PENDING = _$PENDING;
  /// The current status of the invite.
  @BuiltValueEnumConst(wireName: r'ACCEPTED')
  static const InviteStatus ACCEPTED = _$ACCEPTED;
  /// The current status of the invite.
  @BuiltValueEnumConst(wireName: r'DECLINED')
  static const InviteStatus DECLINED = _$DECLINED;
  /// The current status of the invite.
  @BuiltValueEnumConst(wireName: r'CANCELLED')
  static const InviteStatus CANCELLED = _$CANCELLED;
  /// The current status of the invite.
  @BuiltValueEnumConst(wireName: r'EXPIRED')
  static const InviteStatus EXPIRED = _$EXPIRED;

  static Serializer<InviteStatus> get serializer => _$inviteStatusSerializer;

  const InviteStatus._(String name): super(name);

  static BuiltSet<InviteStatus> get values => _$values;
  static InviteStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class InviteStatusMixin = Object with _$InviteStatusMixin;

