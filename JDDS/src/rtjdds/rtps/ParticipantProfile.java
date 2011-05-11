//================================================================
//
//	ParticipantProfile.java - Created by kerush, 2006 27-nov-06 3:28:46 
//
//================================================================
//
//					  R T  j  D D S  version 0.1
//
//				Copyright (C) 2006 by Vincenzo Caruso
//					   <bitclash[at]gmail.com>
//
// This program is free software; you can redistribute it and/or
// modify it under  the terms of  the GNU General Public License
// as published by the Free Software Foundation;either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or  FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// A copy of the GNU  General Public License  is available in the
// file named LICENSE,  that  should  be  shipped along with this
// package;  if not,  write to the Free Software Foundation, Inc., 
// 51 Franklin Street, Fifth Floor,   Boston, MA  02110-1301, USA.
//
//================================================================
package rtjdds.rtps;

public class ParticipantProfile {
	
	private int max_local_reader_per_participant = 20;
	
	private int max_local_writer_per_participant = 20;
	
	private int max_remote_reader_per_participant = 20;
	
	private int max_remote_writer_per_participant = 20;
	
	private int max_remote_writer_per_reader = 10;
	
	private int max_remote_reader_per_writer = 10;
	
	private int max_subscribed_topic = 20;
	
	private int max_published_topic = 20;

}