package domain;

<<<<<<< HEAD
import controller.¿¹¸ÅÇÁ·Î±×·¥;
=======
import controller.ì˜ˆë§¤í”„ë¡œê·¸ë¨;
>>>>>>> refs/remotes/origin/master

public class íšŒì› implements í‚¤ì˜¤ìŠ¤í¬ {
	
	
	
	
	private String id;
	private String password;
	private String name;
		
	
		
	
	// ë¹ˆ ìƒì„±ì
	public íšŒì›() { }
	// ëª¨ë“  í•„ë“œ ìƒì„±ì
	public íšŒì›(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	@Override
	public void ë©”ë‰´() {
	}


	@Override
<<<<<<< HEAD
	public void ·Î±×ÀÎ() {
		System.out.println("ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");String id	 = ¿¹¸ÅÇÁ·Î±×·¥.scanner.next();
		System.out.println("Password¸¦ ÀÔ·ÂÇÏ¼¼¿ä : "); String password	 = ¿¹¸ÅÇÁ·Î±×·¥.scanner.next();
			for( int i = 0; i<list.¿µÈ­È¸¿ø¸ñ·Ï.size(); i++ ) {
				if( list.¿µÈ­È¸¿ø¸ñ·Ï.get(i).id.equals(id) && list.¿µÈ­È¸¿ø¸ñ·Ï.get(i).password.equals(password) ) {
					System.out.println("·Î±×ÀÎ ¼º°ø ---------------->");
				}
				else { System.out.println("ÀÔ·ÂÇÏ½Å Á¤º¸°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.");
=======
	public void ë¡œê·¸ì¸() {
		System.out.println("IDë¥¼ ì…ë ¥í•˜ì„¸ìš” : ");String id	 = ì˜ˆë§¤í”„ë¡œê·¸ë¨.scanner.next();
		System.out.println("Passwordë¥¼ ì…ë ¥í•˜ì„¸ìš” : "); String password	 = ì˜ˆë§¤í”„ë¡œê·¸ë¨.scanner.next();
			for( int i = 0; i<list.ì˜í™”íšŒì›ëª©ë¡.size(); i++ ) {
				if( list.ì˜í™”íšŒì›ëª©ë¡.get(i).equals(id) && list.ì˜í™”íšŒì›ëª©ë¡.get(i).equals(password) ) {
					System.out.println("ë¡œê·¸ì¸ ì„±ê³µ ---------------->");
				}
				else { System.out.println("ì…ë ¥í•˜ì‹  ì •ë³´ê°€ ì¼ì¹˜í•˜ì§€ ì•ŠìŠµë‹ˆë‹¤.");
>>>>>>> refs/remotes/origin/master
				}
			}
		
	}

	@Override
	public void íšŒì›ê°€ì…() {
		int ìŠ¤ìœ„ì¹˜ =0 ;
		System.out.println("IDë¥¼ ì…ë ¥í•˜ì„¸ìš” : ");String id	 = ì˜ˆë§¤í”„ë¡œê·¸ë¨.scanner.next();
	while( true ) {
		for(int i = 0 ; i<list.ì˜í™”íšŒì›ëª©ë¡.size(); i++) {
									//ë¦¬ìŠ¤íŠ¸ë‚´ ê°ì²´ ìˆ˜
			if(list.ì˜í™”íšŒì›ëª©ë¡.get(i).equals(id)) {
							// ië²ˆì§¸ì˜ ì•„ì´ë””ê°€ í˜„ì¬ìœ„ì—ì…ë ¥ëœ ì•„ì´ë””ì™€ ë™ì¼í•˜ë©´
				System.out.println("------>í˜„ì¬ ì‚¬ìš©ì¤‘ì¸ ì•„ì´ë””ì…ë‹ˆë‹¤.");
				ìŠ¤ìœ„ì¹˜ = 1 ;
				break;
			}
		}
		if(ìŠ¤ìœ„ì¹˜ == 0) {
			System.out.println("Passwordë¥¼ ì…ë ¥í•˜ì„¸ìš” : "); String password	 = ì˜ˆë§¤í”„ë¡œê·¸ë¨.scanner.next();
			System.out.println("ì´ë¦„ì„ ì…ë ¥í•˜ì„¸ìš” : "); String name	 = ì˜ˆë§¤í”„ë¡œê·¸ë¨.scanner.next();
			
			íšŒì› temp = new íšŒì›(id, password, name );
			list.ì˜í™”íšŒì›ëª©ë¡.add(temp);
			System.out.println("-------> íšŒì›ê°€ì… ì„±ê³µ");
			return;
		}
	}
	
		
		
	while( true ) {
		int ½ºÀ§Ä¡ =0 ;
		System.out.println("ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");String id	 = ¿¹¸ÅÇÁ·Î±×·¥.scanner.next();
		
		for(int i = 0 ; i<list.¿µÈ­È¸¿ø¸ñ·Ï.size(); i++) {
									//¸®½ºÆ®³» °´Ã¼ ¼ö
			if(list.¿µÈ­È¸¿ø¸ñ·Ï.get(i).id.equals(id)) {
							// i¹øÂ°ÀÇ ¾ÆÀÌµğ°¡ ÇöÀçÀ§¿¡ÀÔ·ÂµÈ ¾ÆÀÌµğ¿Í µ¿ÀÏÇÏ¸é
				System.out.println("------>ÇöÀç »ç¿ëÁßÀÎ ¾ÆÀÌµğÀÔ´Ï´Ù.");
				½ºÀ§Ä¡ = 1 ;
				break;
			}
		}
		if(½ºÀ§Ä¡ == 0) {
			System.out.println("Password¸¦ ÀÔ·ÂÇÏ¼¼¿ä : "); String password	 = ¿¹¸ÅÇÁ·Î±×·¥.scanner.next();
			System.out.println("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä : "); String name	 = ¿¹¸ÅÇÁ·Î±×·¥.scanner.next();
			
			È¸¿ø temp = new È¸¿ø(id, password, name );
			list.¿µÈ­È¸¿ø¸ñ·Ï.add(temp);
			System.out.println("-------> È¸¿ø°¡ÀÔ ¼º°ø");
			return;
		}
	}
	
		
	}
	@Override
	public void ë¹„íšŒì›ì˜ˆë§¤() {
	}

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	
	
	
 

	
	
}	// class end

